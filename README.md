# Greenier-Farm-3-New
 A de-compilation of the third version of Gameloft's Green Farm series. This decomp is based on the launch version (1.0.6) for the Samsung GT-S8000 Jet. The goal is not matching, but deobfuscating and documenting it enough for the code to by readable and logically identical.
# Building
## J2ME Setup (nnproject)
- [Windows](https://nnp.nnchan.ru/wiki/?page=j2medevwin)
- [Linux](https://nnp.nnchan.ru/wiki/?page=j2medevlinux)
Make sure to use JDK 1.6 instead of JDK 1.8

You may need to add `ulimit -n 10000` to `KEmulator.sh` and `uei/emulator` if you get an error about memory on Linux. You may also have to set the executable flag of the executables (including the `uei` folder) for KEmulator to be detected as a device by Eclipse.


# Important note #
This decomp is currently buildable and (partially) deobfuscated, however the game freezes on start making it unplayable. (using KEmulator)
