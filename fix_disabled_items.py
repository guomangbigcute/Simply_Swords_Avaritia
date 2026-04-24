#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import re
import os

# 需要注释的物品列表
disabled_items = [
    'AWAKENED_LICHBLADE', 'HARBINGER', 'SUNFIRE', 'MAGISPEAR', 'MAGIBLADE',
    'MAGISCYTHE', 'CAELESTIS', 'WICKPIERCER', 'DECAYING_RELIC', 'RIBBONCLEAVER',
    'ENIGMA', 'SOULPYRE', 'SOULKEEPER', 'TWISTED_BLADE', 'HEARTHFLAME',
    'SOULRENDER', 'SLUMBERING_LICHBLADE', 'WAKING_LICHBLADE', 'BRIMSTONE_CLAYMORE',
    'ICEWHISPER', 'ARCANETHYST', 'THUNDERBRAND', 'WHISPERWIND', 'WATCHER_CLAYMORE'
]

files_to_fix = [
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\item\UniqueSwordItem.java',
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\item\custom\DormantRelicSwordItem.java',
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\item\custom\EnigmaSwordItem.java',
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\item\custom\LichbladeSwordItem.java',
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\item\custom\RibboncleaverSwordItem.java',
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\mixin\LivingEntityMixin.java',
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\mixin\ServerPlayerEntityMixin.java',
    r'G:\SimplySwords-Architectury-1.20\common\src\main\java\net\mayaguomang\simpleswordavaritia\util\HelperMethods.java',
]

for file_path in files_to_fix:
    if not os.path.exists(file_path):
        print(f"File not found: {file_path}")
        continue
    
    with open(file_path, 'r', encoding='utf-8') as f:
        lines = f.readlines()
    
    new_lines = []
    for line in lines:
        # 检查是否包含任何被禁用的物品
        is_disabled = False
        for item in disabled_items:
            if f'ItemsRegistry.{item}' in line:
                is_disabled = True
                break
        
        if is_disabled and not line.strip().startswith('//'):
            new_lines.append('// DISABLED: ' + line)
        else:
            new_lines.append(line)
    
    with open(file_path, 'w', encoding='utf-8') as f:
        f.writelines(new_lines)
    
    print(f'Fixed: {os.path.basename(file_path)}')

print('\nAll files fixed successfully!')
