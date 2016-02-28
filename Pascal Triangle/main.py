class Solution:
    # @return a list of lists of integers
                def generate(self, numRows):
        def doit(solution,actual,total):
            if(actual==1):
                row = [1]
                solution.append(row)
                doit(solution,actual+1,total)
                return
                        if(actual>total):
                return
                        i = 0;
            row = []
            for i in range(0,actual):
                if i==0 or i==actual-1:
                    row.append(1)
                else:
                    row.append(solution[actual-2][i-1] + solution[actual-2][i])
            solution.append(row)
            doit(solution,actual+1,total)
            return
            solution =  []
        if numRows==0:
            return solution
        doit(solution,1,numRows)
        return solution
