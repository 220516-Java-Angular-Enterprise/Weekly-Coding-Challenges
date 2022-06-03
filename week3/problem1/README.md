# Valid Words

<br>

Given a sentence only having lowercase letters ('a' -> 'z'), digits ('0' -> '9'), hyphens ('-'), punctuation marks ('!'
, '.', and ','), and spaces (' ') only. Each sentence can be broken down into **one or more tokens** separated by one or
more
spaces ' '.

A token is a valid word if **all three** of the following are true:

- It only contains lowercase letters, hyphens, and/or punctuation (no digits).
- There is **at most one** hyphen '-'. If present, it **must** be surrounded by lowercase characters ("a-b" is valid,
  but "-ab"
  and "ab-" are not valid).
- There is **at most one** punctuation mark. If present, it **must** be at the **end** of the token ("ab,", "cd!", and "
  ." are
  valid, but "a!b" and "c.," are not valid).

Examples of valid words include "a-b.", "afad", "ba-c", "a!", and "!".

Given a string sentence, return the **number** of valid words in sentence.

<br>

**Note:** YOU CANNOT USE REGEX!

<br>

**Example 1:**
<pre>
<b>Input:</b> sentence = "cat and  dog"
<b>Output:</b> 3
<b>Explanation:</b> The valid words in the sentence are "cat", "and", and "dog".
</pre>

**Example 2:**
<pre>
<b>Input:</b> sentence = "!this  1-s b8d!"
<b>Output:</b> 0
<b>Explanation:</b> There are no valid words in the sentence.
"!this" is invalid because it starts with a punctuation mark.
"1-s" and "b8d" are invalid because they contain digits.
</pre>

**Example 3:**
<pre>
<b>Input:</b> sentence = "alice and  bob are playing stone-game10"
<b>Output:</b> 5
<b>Explanation:</b> The valid words in the sentence are "alice", "and", "bob", "are", and "playing".
"stone-game10" is invalid because it contains digits.
</pre>