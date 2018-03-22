class Tree(object):
	def __init__(self):
		self.data = None
		self.left = None
		self.right = None
		

tree = Tree()
tree.left = Tree()
tree.left.data = "left"
data = tree.left.data
print data

		
