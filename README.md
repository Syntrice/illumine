# Illumine
Illumine is a personal Fabric Mod for Minecraft.
It's a place for me to experiment with things I would like to add to Minecraft.

---
Illumite uses a python library [mcresources](https://github.com/alcatrazEscapee/mcresources) in order to generate resource files.
However it's not needed to build the project, only to quickly generate new resource and data files.

To use mcresources, you can just set up a virtual environment from the included requirements.txt in the resourcegen folder:

For Windows 10
1. Run `py -m venv env` from resourcegen to create the virtual enviroment
2. From the same folder, run `./env/Scripts/activate`
3. You can now download dependencies with `pip install -r requirements.txt`