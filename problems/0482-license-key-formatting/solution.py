class Solution(object):
    def licenseKeyFormatting(self, s, k):
        string = s.replace('-', '').upper()
        print(string)

        mod = len(string) % k
        print(mod)

        parts = []

    
        if mod > 0:
            parts.append(string[:mod])

        for i in range(mod, len(string), k):
            parts.append(string[i:i+k])
        print(parts)    

    
        return '-'.join(parts)
        
