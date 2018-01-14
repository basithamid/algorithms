class Node:
    def __init__(self, data = None):
        self.left = None
        self.right = None
        self.value = data

class BST:
    def __init__(self):
        self.root = None

    def insert(self, data):
        if self.root == None:
            self.root = Node(data)
        else:
            temp = self.root

            while True:
                if data <= temp.value:
                    if temp.left:
                        temp = temp.left
                    else:
                        temp.left = Node(data)
                        break

                else:
                    if temp.right:
                        temp = temp.right
                    else:
                        temp.right = Node(data)
                        break

    def inOrder(self, root):
        temp = root
        if temp == None:
            return None
        else:
            if temp.left:
                self.inOrder(temp.left)
            print(temp.value)
            if temp.right:
                self.inOrder(temp.right)



    def search(self, data):
        temp = self.root
        while temp is not None:
            if temp.value == data:
                return 1
            if data <= temp.value:
                temp = temp.left
            elif data > temp.value:
                temp = temp.right

        if temp is None:
            return 0

    def iterativePreOrder(self):
        if self.root is None:
            return None

        nodeStack = []
        nodeStack.append(self.root)

        while len(nodeStack) > 0:
            node  = nodeStack.pop()
            print(node.value)

            if node.right:
                nodeStack.append(node.right)

            if node.left:
                nodeStack.append(node.left)

        return self.root


    def iterativeInOrder(self):
        if self.root is None:
            return self.root
        curr = self.root
        while curr is not None:
            if curr.left is None:
                print(curr.value)
                curr = curr.right
            else:
                pre = curr.left

                while pre.right is not None and pre.right is not curr:
                    pre = pre.right

                if pre.right is None:
                    pre.right = curr
                    curr = curr.left

                else:
                    pre.right = None
                    print(curr.value)
                    curr = curr.right




bst = BST()
n = int(input())
for i in range(0, n):
    bst.insert(int(input()))
bst.inOrder(bst.root)

s = bst.search(int(4))
if s == 0:
    print("Element doesn't exist")
else:
    print("Element exists")

print("preorder traversal")
bst.iterativePreOrder()


print("inorder iterative")
bst.iterativeInOrder()
