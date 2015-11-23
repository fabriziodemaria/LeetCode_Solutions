class Solution(object):
        def action(self,n):
        number = str(n)
        res = 0
        for i in range(0,len(number)):
            res += int(number[i])
        return res
                def addDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        while(num>9):
            num = self.action(num)
        return num
                 