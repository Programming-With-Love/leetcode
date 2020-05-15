class Solution(object):
    def sortedSquares(self, A):
        for i in range(len(A)):
            A[i] *= A[i]
        return sorted(A)
