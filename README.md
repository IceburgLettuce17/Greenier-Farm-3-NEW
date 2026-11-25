# Greenier-Farm-3-New
 A de-compilation of the third version of Gameloft's Green Farm series. This decomp is based on the launch version (1.0.6) for the Samsung GT-S8000 Jet. The goal is not matching, but deobfuscating and documenting it enough for the code to by readable and logically identical.

# Project Status
I cannot work on the project right now because my computer broke. Once my computer gets fixed, work on the project will resume as normal.
# Building
## J2ME Setup (nnproject)
- [Windows](https://nnp.nnchan.ru/wiki/?page=j2medevwin)
- [Linux](https://nnp.nnchan.ru/wiki/?page=j2medevlinux)
Make sure to use JDK 1.6 instead of JDK 1.8

(You also could use GLEmulator instead of KEmulator, but I haven't tested it)

# Goals
I will start work on these when I can work on the project.
- (N) Deobfuscate all of GLLib (Classes fully deobfuscated as of now: GLLib) 
- (N) Fully document everything in Define.java
- (N) Update the Eclipse project to use the right ProGuard version
- (N) Make the game load the splash screen GS (GS_GAMELOFT)

# Q&A
Q: Where did cGame originate from?
A: Aurora Game Engine (AGE) games (Diamond Rush, Platinum Sudoku, and the like). -Most GLLib games use a capital C instead of a lowercase one though (I still have to fix it here).-

A GLLib method mentions cGame with that exact capitalization, which confirms the capitalization format isn't just exclusive to AGE games.

Q: Is this a decompilation?
A: Yes. It's made using a mix of decompilers, as well as using JDO for deobfuscation, a more-than-a-decade-old program made in VB.

Q: What decomps do you plan on doing next?
A: Green Farm 1, Diamond Rush, Abracadaball and LBC.

Q: What decomps have you done?
A: I've done this specific game (Green Farm 3) multiple times (I had to move to Procyon w/ JDO (a.k.a. this repo), with some help from Vineflower because Fernflower was hot garbage, and that was the 3rd time I switched bases. 1st was because it was garbage and used JADX).

Q: What decompilers will you use for this project?
A: A mix of Procyon (the base decompiler), Vineflower, JADX, CFR, and a little bit of manual bytecode translations.

Q: Are you aware of the recently discovered BBUI, MIDP and WIPI GLLib leaks?
A: Yes. They contain important method signatures not present in other known leaked versions, such as PFX and IAP methods.

# Important note
This decomp is currently buildable and (partially) deobfuscated, however the game freezes on start making it unplayable. (using KEmulator)
