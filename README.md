# MiniLauncher
A simple launcher for smaller modpacks, that allows itself to be redistributed
as an extractor and configurator.

## Why?
I feel that most third-party launchers lack more intricate forms of customization when it comes to more specific parts of the packs, or the customization is not very user-friendly (i.e. you have to leave the launcher to do certain things). 

This idea sparked up because I ran into a very specific issue where the Create Mod refuses to work with Sodium. 
This issue can be resolved however through multiple methods, whether it be a manual edit to the fabric.json file in Create, or by making sure Iris (along with shaders) is installed, there is no way to indicate this to recipients of the modpack without informing them as an afternote.

## What?

The long term goal is to allow users to customize a full Minecraft install, down to additional content required post-unpacking.

The current roadmap is as follows:

| Task          | Description                                           | State |
| :-----------: | :---------------------------------------:             | :---: |
| Compressing   | Allow for compression and distribution of the modpack |  [ ]  |
| Configuring   | Allow for basic configuring of settings               |  [ ]  |
|               | Allow for more intricate configuration of settings    |  [ ]  |
|               | Allow for mod state/file configuration                |  [ ]  |
| Mods          | Allow for installation of mods from Modrinth          |  [ ]  |
| Modrinth      | Grab mod dependencies from Modrinth                   |  [ ]  |
|               | Allow for installation of Resource and Shader packs   |  [ ]  |
| Curator       | Allow the creator to set recommendations for the user |  [ ]  | 
|               | Allow the creator to script basic post-install scripts|  [ ]  |