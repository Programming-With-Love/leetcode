# leetcode

🚴‍♀️ I like to brush leetcode, it is a way of my pastime. I really **enjoy** it, I will always update it.

📖 [算法复杂度和时间复杂度](https://zhuanlan.zhihu.com/p/50479555)

✊ 不间断刷题天数：8天

🐘 最长连续刷题天数：8天

🧗‍♂️ 已解题目：112道

-------

#### Array

| #     | Title                                                        | Solution                                                     | Time | Space | Note                                                         |
| ----- | ------------------------------------------------------------ | ------------------------------------------------------------ | ---- | ----- | ------------------------------------------------------------ |
| No01  | [Two Sum](https://leetcode.com/problems/two-sum/)            | [java](https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No01.java) | O(n) | O(n)  | 采用map存储值和下标，然后再次遍历，判断得到结果。            |
| No26  | [Remove Duplicates from Sorted Array](<https://leetcode.com/problems/remove-duplicates-from-sorted-array/>) | [java](<https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No26.java>) | O(n) | O(1)  | 定义i来记录不相等的个数，因为记录从下标0开始，最后长度需要加1. |
| No27  | [Remove Element](<https://leetcode.com/problems/remove-element/>) | [java](<https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No27.java>) | O(n) | O(1)  | 采用变量来记录相同的值。                                     |
| No35  | [Search Insert Position](<https://leetcode.com/problems/search-insert-position/>) | [java](<https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No35.java>) | O(n) | O(1)  | 1⃣ 找到给定数大于数组的元素。2⃣ 遍历，一个一个条件的判断。     |
| No53  | [Maximum Subarray](<https://leetcode.com/problems/maximum-subarray/>) | [java](<https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No53.java>) | O(n) | O(1)  | 设置max字段的初始值为最小的整数。                            |
| No66  | [Plus One](<https://leetcode.com/problems/plus-one/>)        | [java](<https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No66.java>) | O(n) | O(n)  | 该算法解法中做了合适的小于9的判断。                          |
| No88  | [Merge Sorted Array](<https://leetcode.com/problems/merge-sorted-array/>) | [java](<https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No88.java>) | O(n) | O(1)  | 插入之后采用Arrays.sort()排序。                              |
| No121 | [Best Time to Buy and Sell Stock](<https://leetcode.com/problems/best-time-to-buy-and-sell-stock/>) | [java](<https://github.com/tujietg/Algorithm/blob/master/leetcode/Array/No121.java>) | O(n) | O(1)  | 一次死循环，利用中间值做判断。                               |
| No122 | [Best Time to Buy and Sell Stock II](<https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/>) | [java]()                                                     | O(n) | O(1)  | 一次循环，判断后值比前值大。                                 |

-------

#### Dynamic Programming

| #      | Title                                                        | Solution | Time | Space | Note                                 |
| ------ | ------------------------------------------------------------ | -------- | ---- | ----- | ------------------------------------ |
| No303  | [Range Sum Query](https://leetcode.com/problems/range-sum-query-immutable/) | [java]() | O(1) | O(n)  | sumRange被频繁的调用。               |
| No746  | [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/) | [java]() | O(N) | O(n)  | 先计算到达每个楼梯最小数字，在做减法 |
| No1025 | [Divisor Game](https://leetcode.com/problems/divisor-game/)  | [java]() | O(1) | O(1)  |                                      |

-----

#### String

| #     | Title                                                        | Solution | Time | Space | Note                   |
| ----- | ------------------------------------------------------------ | -------- | ---- | ----- | ---------------------- |
| No67  | [Add Binary](https://leetcode.com/problems/add-binary/)      | [java]() | O(N) | O(1)  | 相当于自己做了加法运算 |
| No344 | [Reverse String](https://leetcode.com/problems/reverse-string/) | [java]() | O(N) | O(1)  | 利用中间值进行修改。   |

