# Greenier-Farm-3-New
 A de-compilation of the third version of Gameloft's Green Farm series. This decomp is based on the launch version (1.0.6) for the Samsung GT-S8000 Jet. The goal is not matching, but deobfuscating and documenting it enough for the code to by readable and logically identical.
# Building
## J2ME Setup (nnproject)
- [Windows](https://nnp.nnchan.ru/wiki/?page=j2medevwin)
- [Linux](https://nnp.nnchan.ru/wiki/?page=j2medevlinux)
Make sure to use JDK 1.6 instead of JDK 1.8

You may need to add `ulimit -n 10000` to `KEmulator.sh` and `uei/emulator` if you get an error about memory on Linux. You may also have to set the executable flag of the executables (including the `uei` folder) for KEmulator to be detected as a device by Eclipse.

# Q&A
Q: Where did cGame originate from?
A: Mostly Aurora Game Engine games (Diamond Rush, Platinum Sudoku, and the like). Most GLLib games use a capital C instead of a lowercase one though (I still have to fix it here)

Q: Where did you get GLLib source code from?
A: * sighs * Next question.

Q: Is this a decompilation?
A: Yes. It's made using JDO, a more-than-a-decade-old program made in VB.

Q: What decomps do you plan on doing next?
A: Green Farm 1, Diamond Rush, Abracadaball and LBC.

Q: What decomps have you done?
A: I've done this specific game (Green Farm 3) multiple times (I had to move to Procyon w/ JDO (a.k.a. this repo), with some help from Vineflower because Fernflower was hot garbage, and that was the 3rd time I switched bases. 1st was because it was garbage and used JADX).

# Important note #
This decomp is currently buildable and (partially) deobfuscated, however the game freezes on start making it unplayable. (using KEmulator)
