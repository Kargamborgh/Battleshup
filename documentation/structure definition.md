How the program works:

Abstract Ship class is used to define what attributes the ships should have, how many "squares" they have (size) and what sort of methods they should implement.

FiveShip, FourShip, ThreeShip and TwoShip classes extend the Ship class and are the actual instantiable classes. In hindsight most of the functionality could have been done inside the Ship class and the separate size-differing classes would not be necessary.

The Grid class doubles as the GUI and the playing field for the game. It sets up all the graphical stuff and handles most of the game logic.

The ButtonListener class is used to listen for button clicks and to change the JButtons' labels accordingly.

