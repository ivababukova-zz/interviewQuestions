
import sys

# program that checks whether a String is palindrome or not
# method: takes the input string and if it is even, separates it to 2 strings;
# then it reverses the order of the second string and checks whether the two
# strings are equal. If yes: the input is a palindrome
# if the input string is odd: finds the middle character, removes it and follows
# the same procedure as with an odd string


def isPalindrome (s):
    halfLenS = len(s)/2

    if len(s) % 2 != 0:
        midchar = halfLenS + 1
        s = s[0:midchar - 1] + s[midchar:]
        
    s1 = s[0:halfLenS]
    s2 = s[halfLenS:]
    s2rev = s2[::-1]
    
    if s1 == s2rev:
        print("it is a palindrome")
    else:
        print("it is NOT a palindrome")

s = sys.argv[1]
isPalindrome(s)





print("reversed input: " + s[::-1])
