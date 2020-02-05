44leetcode

🚴‍♀️ I like to brush leetcode, it is a way of my pastime. I really **enjoy** it, I will always update it.

📖 [算法复杂度和时间复杂度](https://zhuanlan.zhihu.com/p/50479555)

✊ 不间断刷题天数：1天

🐘 最长连续刷题天数: 11天

🧗‍♂️ 已解题目：137道

-------

#### Array

| #     | Title                                                        | Solution                                                     | Note                                                         |
| ----- | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| No01  | [Two Sum](https://leetcode.com/problems/two-sum/)            | [java](https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No01.java) | 采用map存储值和下标，然后再次遍历，判断得到结果。            |
| No26  | [Remove Duplicates from Sorted Array](<https://leetcode.com/problems/remove-duplicates-from-sorted-array/>) | [java](<https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No26.java>) | 定义i来记录不相等的个数，因为记录从下标0开始，最后长度需要加1. |
| No27  | [Remove Element](<https://leetcode.com/problems/remove-element/>) | [java](<https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No27.java>) | 采用变量来记录相同的值。                                     |
| No35  | [Search Insert Position](<https://leetcode.com/problems/search-insert-position/>) | [java](<https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No35.java>) | 1⃣ 找到给定数大于数组的元素。2⃣ 遍历，一个一个条件的判断。     |
| No53  | [Maximum Subarray](<https://leetcode.com/problems/maximum-subarray/>) | [java](<https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No53.java>) | 设置max字段的初始值为最小的整数。                            |
| No66  | [Plus One](<https://leetcode.com/problems/plus-one/>)        | [java](<https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No66.java>) | 该算法解法中做了合适的小于9的判断。                          |
| No88  | [Merge Sorted Array](<https://leetcode.com/problems/merge-sorted-array/>) | [java](<https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No88.java>) | 插入之后采用Arrays.sort()排序。                              |
| No121 | [Best Time to Buy and Sell Stock](<https://leetcode.com/problems/best-time-to-buy-and-sell-stock/>) | [java](<https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No121.java>) | 一次死循环，利用中间值做判断。                               |
| No122 | [Best Time to Buy and Sell Stock II](<https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/>) | [java]()                                                     | 一次循环，判断后值比前值大。                                 |
| No167 | [两数之和 II - 输入有序数组](https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Array/No169.java) | 双指针进行操作。头和末尾同时开始。                           |
| No169 | [求众数](https://leetcode-cn.com/problems/majority-element/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Array/No169.java) | 计数，出现最多的数最后计数的值最大。                         |
| No189 | [旋转数组](https://leetcode-cn.com/problems/rotate-array/)   | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Array/No189.java) |                                                              |

-------

#### Dynamic Programming

| #      | Title                                                        | Solution | Note                                 |
| ------ | ------------------------------------------------------------ | -------- | ------------------------------------ |
| No303  | [Range Sum Query](https://leetcode.com/problems/range-sum-query-immutable/) | [java]() | sumRange被频繁的调用。               |
| No746  | [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/) | [java]() | 先计算到达每个楼梯最小数字，在做减法 |
| No1025 | [Divisor Game](https://leetcode.com/problems/divisor-game/)  | [java]() |                                      |

-----

#### String

| #     | Title                                                        | Solution | Note                   |
| ----- | ------------------------------------------------------------ | -------- | ---------------------- |
| No67  | [Add Binary](https://leetcode.com/problems/add-binary/)      | [java]() | 相当于自己做了加法运算 |
| No344 | [Reverse String](https://leetcode.com/problems/reverse-string/) | [java]() | 利用中间值进行修改。   |

----

#### Tree

| #     | Title                                                        | Solution                                                     | Note                                                         |
| ----- | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| No100 | [相同的树](https://leetcode-cn.com/problems/same-tree/)      | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No100.java) | 很简单的使用递归，递归的条件，节点是否都为空，或者是否一个为空一个为非空。 |
| No101 | [对称二叉树](https://leetcode-cn.com/problems/symmetric-tree/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No101.java) | 递归遍历，注意，比较的是相对称的节点。                       |
| No104 | [二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No104.java) | 分割成每个小块，比较每个节点左子节点的层级多还是右子节点的层级多。 |
| No108 | [将有序数组转换为二叉搜索树](https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No108.java) | 生成树的时候每次都去找最合适的放在中间的节点。               |
| No110 | [平衡二叉树](https://leetcode-cn.com/problems/balanced-binary-tree/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No110.java) | 每个节点的都需要比较左右节点。另外写一个方法计算子树的高度。 |
| No111 | [二叉树的最小深度](https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No111.java) | 计算每个节点到最底节点的深度。                               |
| No112 | [路径总和](https://leetcode-cn.com/problems/path-sum/)       | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No112.java) | 递归的条件是，和减去当前节点的值最终等于0。                  |
| No226 | [翻转二叉树](https://leetcode-cn.com/problems/invert-binary-tree/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No226.java) | 从最底层的子节点开始旋转。                                   |
| No235 | [ 二叉搜索树的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No235.java) | 递归寻找合适的root节点。                                     |
| No257 | [二叉树的所有路径](https://leetcode-cn.com/problems/binary-tree-paths/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No257.java) | 递归终止条件是root左右节点为空。自上往下的递归。             |
| No617 | [合并二叉树](https://leetcode-cn.com/problems/merge-two-binary-trees/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No617.java) | 计算两个树合并节点的值，然后采用递归依次向下计算。           |
| No94  | [94. 二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No94.java) | 直接使用递归解决。                                           |
| No404 | [404. 左叶子之和](https://leetcode-cn.com/problems/sum-of-left-leaves/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No404.java) | 可以参考全路径求和方法，增加判断条件 true 和false。          |
| No606 | [606. 根据二叉树创建字符串](https://leetcode-cn.com/problems/construct-string-from-binary-tree/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No606.java) | 递归，根据是否为“”来判断采用什么样的方式。（左右节点是否为空所带来的字符串不一样） |
| No637 | [637. 二叉树的层平均值](https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No637.java) | 采用队列的方式解决。                                         |
| No653 | [653. 两数之和 IV - 输入 BST](https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/) | [java](https://github.com/Programming-With-Love/leetcode/blob/master/leetcode/Tree/No653.java) |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |

