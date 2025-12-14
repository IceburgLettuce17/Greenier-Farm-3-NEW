# Contributing to the decomp

If you are interested in contributing, you may do so via pull requests. If you would like to discuss findings you can do so via the discussion tab of this repository.

# Guidelines

- All variables and methods, unless taken from official Gameloft code, as in code from other unobfuscated Gameloft games, or leaked code (e.g: Leaked MIDP2 GLLib source), should follow the [Java naming conventions](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html).
- Leaked code (e.g: leaked GLLib docs/source), will be fact-checked.
- Names should be descriptive and not generic (existing decompiler-generated names are exempt from this). (example: s_iapCashTexts from cGame)
- Abbreviate only when a name becomes excessively long, and do so consistently. (example: rmsExpAmount instead of rmsExperienceAmount)
- Do not rename any methods or variables with names derived from official (leaked) code. 
Currently this applies to any class beginning with GLLib, as well as ASprite.
- Make sure that code is kept logically identical when restructuring label-heavy code. You should test your changes to ensure they don't introduce any bugs that weren't present in the original game.
- If anyone asks where I got the GLLib source from, just don't ask


Note that these rules don't apply to me as I forget stuff sometimes.