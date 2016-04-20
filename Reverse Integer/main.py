class Solution:
    # @return an integer
    def reverse(self, x):
        numero = str(x)
        out = '';
        for i in reversed(range(len(numero))):
            if numero[i] != '-':
                out = out + str(numero[i])
        if numero[0] == '-':
            out = '-' + out
        return int(out)
         