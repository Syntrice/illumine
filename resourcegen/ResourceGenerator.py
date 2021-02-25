from mcresources.resource_manager import ResourceManager
from mcresources.utils import clean_generated_resources

modID = "illumine"
pathTuple = ('../', 'src', 'main', 'resources')
path = "../src/main/resources"

rm = ResourceManager(modID, pathTuple)
clean_generated_resources(path)


# Creates resources for a simple block
def simple_block(path1, name):
    rm.block(path1)\
        .with_block_model()\
        .with_blockstate()\
        .with_item_model()\
        .with_block_loot(modID + ":" + name)\
        .with_lang(name, "en_us")


simple_block("limestone", "Limestone")
simple_block("polished_limestone", "Polished Limestone")
simple_block("polished_limestone_bricks", "Polished Limestone Bricks")
simple_block("chiseled_polished_limestone", "Chiseled Polished Limestone")
simple_block("cracked_polished_limestone_bricks", "Cracked Polished Limestone Bricks")
simple_block("marble", "Marble")
simple_block("polished_marble", "Polished Marble")
simple_block("polished_marble_bricks", "Polished Marble Bricks")

rm.flush()