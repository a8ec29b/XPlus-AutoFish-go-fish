把XPlus Autofish适配了下 https://github.com/Draylar/go-fish/ 这个mod（仅1.20.1 fabric），实现在下界里也可以自动钓鱼。   
基于声音的判断没改（也就是用不了）；只测试过多人模式下的 FishMonitorMPMotion 修改有效；单人模式未测试。   
没有判断钓竿能不能在当前区域用，也就是如果同时持有普通钓竿和其他钓竿在岩浆里钓鱼可能自动换杆的逻辑会把普通钓竿换出来（没测试）   
其他的暂时没想到，以下是原项目的readme   


## XPlus Autofish

XPlus Autofish is a temp update of [MrTroot's Autofish mod](https://www.curseforge.com/minecraft/mc-mods/autofish) to 1.19.4+.

In short, just cast the fishing rod into the water once, and it will automatically reel in at the correct time and recast after a couple second wait. You can open the config screen of the mod via hotkey (V by default).

### Download

You can download the mod from:

| Link type  | Link                                                         |
| ---------- | ------------------------------------------------------------ |
| Modrinth   | [https://modrinth.com/mod/x+-autofish](https://modrinth.com/mod/x+-autofish) |
| Curseforge | [https://www.curseforge.com/minecraft/mc-mods/x-autofish](.curseforge.com/minecraft/mc-mods/x-autofish) |

