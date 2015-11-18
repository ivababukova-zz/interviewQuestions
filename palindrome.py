import sys

# program that checks whether a String is palindrome or not


def isPalindrome (s):

    print(s)
    if len(s) <= 1:
        print ("it is a palindrome")
        return True
    
    if len(s) > 1:
        
        if s[0] == s[-1]:
            isPalindrome(s[1:-1])
        else:
            print("it is NOT a palindrome")
            return False


s = sys.argv[1]
isPalindrome(s)



