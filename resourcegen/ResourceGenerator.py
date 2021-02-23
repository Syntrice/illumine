from mcresources.resource_manager import ResourceManager
from mcresources.utils import clean_generated_resources

modID = "illumine"
pathTuple = ('../', 'src', 'main', 'resources')
path = "../src/main/resources"

rm = ResourceManager(modID, pathTuple)
clean_generated_resources(path)









