class Solution(object):
    def shiftingLetters(self, s, shifts):
        arr = [0] * len(s)
        
        # Step 1: Populate the difference array
        for start, end, direction in shifts:
            if direction == 1:
                arr[start] += 1
                if end + 1 < len(s):
                    arr[end + 1] -= 1
            else:
                arr[start] -= 1
                if end + 1 < len(s):
                    arr[end + 1] += 1

        # Step 2: Convert to prefix sum
        for i in range(1, len(arr)):
            arr[i] += arr[i - 1]

        # Step 3: Transform the string
        result = []
        for i, char in enumerate(s):
            shift = arr[i] % 26  # Normalize shift
            new_char = chr((ord(char) - ord('a') + shift + 26) % 26 + ord('a'))
            result.append(new_char)

        return ''.join(result)

        
