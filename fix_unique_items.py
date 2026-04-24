#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import os
import re

# 需要注释的物品列表
disabled_items = [
    'AWAKENED_LICHBLADE', 'HARBINGER', 'SUNFIRE', 'MAGISPEAR', 'MAGIBLADE',
    'MAGISCYTHE', 'CAELESTIS', 'WICKPIERCER', 'DECAYING_RELIC', 'RIBBONCLEAVER',
    'ENIGMA', 'SOULPYRE', 'SOULKEEPER', 'TWISTED_BLADE', 'HEARTHFLAME',
    'SOULRENDER', 'SLUMBERING_LICHBLADE', 'WAKING_LICHBLADE', 'BRIMSTONE_CLAYMORE',
    'ICEWHISPER', 'ARCANETHYST', 'THUNDERBRAND', 'WHISPERWIND', 'WATCHER_CLAYMORE'
]

files_to_fix = {
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\item\UniqueSwordItem.java': 'method_block',
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\item\custom\DormantRelicSwordItem.java': 'if_block',
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\item\custom\EnigmaSwordItem.java': 'if_block',
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\item\custom\LichbladeSwordItem.java': 'method_block',
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\item\custom\RibboncleaverSwordItem.java': 'if_block',
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\mixin\LivingEntityMixin.java': 'or_condition',
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\mixin\ServerPlayerEntityMixin.java': 'complex',
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\util\HelperMethods.java': 'or_chain',
}

def comment_out_disabled_items(content):
    """注释掉包含被禁用品引用的行"""
    lines = content.split('\n')
    new_lines = []
    
    for line in lines:
        is_disabled = False
        for item in disabled_items:
            if f'ItemsRegistry.{item}' in line:
                is_disabled = True
                break
        
        if is_disabled and not line.strip().startswith('//'):
            new_lines.append('// DISABLED: ' + line)
        else:
            new_lines.append(line)
    
    return '\n'.join(new_lines)

for file_path, fix_type in files_to_fix.items():
    if not os.path.exists(file_path):
        print(f"File not found: {file_path}")
        continue
    
    with open(file_path, 'r', encoding='utf-8') as f:
        content = f.read()
    
    # 先恢复之前错误注释的内容
    content = content.replace('// DISABLED:         ', '        ')
    content = content.replace('// DISABLED:     ', '    ')
    content = content.replace('// DISABLED: ', '')
    
    # 然后重新正确注释
    content = comment_out_disabled_items(content)
    
    with open(file_path, 'w', encoding='utf-8') as f:
        f.write(content)
    
    print(f'Fixed: {os.path.basename(file_path)} ({fix_type})')

print('\nAll files fixed successfully!')
