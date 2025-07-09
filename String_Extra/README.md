# Java String

## Introduction to Strings in Java

**Definition**: A string in Java is an object that represents a sequence of characters.

**Immutability**: Strings in Java are immutable, meaning once a string object is created, its content cannot be changed. This is handled internally by creating a new string object whenever a modification is made.

## Creating Strings

### Using String Literals:
```java
String str1 = "Hello, World!";
```

### Using the new Keyword:
```java
String str2 = new String("Hello, World!");
```

## String Methods

### Length:
```java
int length = str1.length();
```

### Character Extraction:
```java
char ch = str1.charAt(1); // 'e'
```

### Substring:
```java
String substr = str1.substring(0, 5); // "Hello"
```

### String Comparison:
```java
boolean isEqual = str1.equals(str2); // true if str1 and str2 are the same
boolean isEqualIgnoreCase = str1.equalsIgnoreCase("HELLO, WORLD!"); // true
int comparisonResult = str1.compareTo(str2); // 0 if equal, negative if str1 < str2, positive if str1 > str2
```

### Searching in Strings:
```java
int index = str1.indexOf('o'); // 4
int lastIndex = str1.lastIndexOf('o'); // 8
boolean contains = str1.contains("World"); // true
```

### Replacing Characters/Substrings:
```java
String replacedStr = str1.replace('o', 'a'); // "Hella, Warld!"
String replacedStr2 = str1.replace("World", "Java"); // "Hello, Java!"
```

### Case Conversion:
```java
String upperCaseStr = str1.toUpperCase(); // "HELLO, WORLD!"
String lowerCaseStr = str1.toLowerCase(); // "hello, world!"
```

### Trimming Whitespace:
```java
String trimmedStr = " Hello, World! ".trim(); // "Hello, World!"
```

## String Formatting

### Using String.format:
```java
String formattedStr = String.format("Hello, %s! You have %d new messages.", "Alice", 5);
// "Hello, Alice! You have 5 new messages."
```

## Regular Expressions with Strings

### Pattern Matching:
```java
String regex = "\\d+";
boolean matches = str1.matches(regex); // true if str1 contains only digits
```

### Splitting Strings:
```java
String[] words = str1.split(", ");
// words = ["Hello", "World!"]
```

## String Pool

Java maintains a pool of strings for efficient memory usage. String literals are interned, meaning they are stored in a common pool.

```java
String str3 = "Hello";
String str4 = "Hello";
boolean isSameReference = (str3 == str4); // true, because both refer to the same object in the string pool
```

## Common String Manipulation Examples

### Reversing a String:
```java
public String reverseString(String input) {
    return new StringBuilder(input).reverse().toString();
}
```

### Checking for Palindromes:
```java
public boolean isPalindrome(String input) {
    int left = 0;
    int right = input.length() - 1;
    while (left < right) {
        if (input.charAt(left) != input.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
```

## String Problem Solutions

This folder contains solutions to various string manipulation problems:

1. **CountVowelsConsonants.java** - Count vowels and consonants in a string
2. **ReverseString.java** - Reverse a string without built-in functions
3. **PalindromeCheck.java** - Check if a string is a palindrome
4. **RemoveDuplicates.java** - Remove duplicate characters from a string
5. **LongestWord.java** - Find the longest word in a sentence
6. **SubstringOccurrences.java** - Count substring occurrences
7. **ToggleCase.java** - Toggle case of characters
8. **CompareStrings.java** - Compare strings lexicographically
9. **MostFrequentCharacter.java** - Find most frequent character
10. **RemoveSpecificCharacter.java** - Remove specific character from string
11. **AnagramCheck.java** - Check if two strings are anagrams
12. **ReplaceWord.java** - Replace words in a sentence

Each solution demonstrates proper string handling, parameter passing, and return values in Java.