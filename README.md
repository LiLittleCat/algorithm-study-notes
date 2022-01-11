# :sparkling_heart: 算法学习笔记

我的算法学习笔记，部分内容来自互联网，并已标明出处，如有侵权，请联系删除。

本仓库遵循 [中文文案排版指北](https://github.com/lhajh/chinese-copywriting-guidelines)。

## :thinking: 框架思维

整理自 [labuladong 的算法小抄](https://github.com/labuladong/fucking-algorithm)。

**数据结构的存储方式**

- 数组（顺序存储）
- 链表（链式存储）

各种数据结构都是在数组或者链表上的特殊操作，底层都是数组或者链表实现的。

特点：

- 数组：可随机访问，相对节约空间；扩容、插入或删除时间复杂度 O(N)。
- 链表：不可随机访问，消耗更多空间；扩容、插入或删除时间复杂度 O(1)。

**数据结构的操作**

- 遍历 + 访问
  - 线性（迭代）
  - 非线性（递归）

**框架**

数组遍历框架（线性迭代）

```java
void traverse(int[] arr) {
    for (int i = 0;i < arr.length;i++) {
        // 迭代访问 arr[i]
    }
}
```

链表遍历框架（兼具迭代和递归）

```java
/* 基本的单链表节点 */
class ListNode {
    int val;
    ListNode next;
}

void traverse(ListNode head) {
    for (ListNode p = head;p != null;p = p.next) {
        // 迭代访问 p.val
    }
}

void traverse(ListNode head) {
    // 迭代访问 head.val
    traverse(head.val);
}
```

二叉树遍历框架（非线性递归）

```java
/* 基本的二叉树节点 */
class TreeNode {
    int val;
    TreeNode left, right;
}

void traverse(TreeNode root) {
    // 前序遍历
    traverse(root.left);
    // 中序遍历
    traverse(root.right);
    // 后序遍历
}

```

 N 叉树的遍历框架

```java
/* 基本的 N 叉树节点 */
class TreeNode {
    int val;
    TreeNode[] children;
}

void traverse(TreeNode root) {
    for (TreeNode child : root.children)
        traverse(child);
}
```

## :blue_book: LeetBook

- :sparkles:[初级算法](https://github.com/LiLittleCat/leetcode-solutions/blob/master/leetbook/top-interview-questions-easy.md)

- 