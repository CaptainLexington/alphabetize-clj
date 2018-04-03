# alphabetize

Although computers are excellent at sorting things, naive alphabetical sorts give famously counter-intuitive results. Alphabetize seeks to provide a flexible alternative based on the guidelines book editors use to alphabetize lists.


## Usage

Alphabetize provides a bunch of options based on your use cases.

* `:sort-mode` The :sort-mode option takes two options: `:letter-by-letter` and `:word-by-word`. Letter-by-letter sorts strings as though every string were a single word; word-by-word sort sorts multiple-word phrases together by initial words. Thus, in letter-by-letter sort, "New Zealand" comes after "Newton", becauze Z comes after T; in word-by-word sort, "New Zealnad" comes before "Newton" because all phrases beginning with the word "new" come before words beginning the with the letters n-e-w. Default is `:word-by-word`.
* `:initial-number-sort` controls how strings that begin with numerals should be sorted, either `:numerically` or `:alphabetically`. If  they are sorted numerically, they will apear at the beginning of the sorted list. If they are sorted alphabetically, they will apear as though the numbers were spelled out. Default is `:alphabetically`.
* `:internal-number-sort` controls how strings that contain numerals interally should be sorted, also either `:numerically` or `:alphabetically`. Default is `:numerically`.
* `:years?`: If `:years?` is true, four-digit words will be evaluated for sorting as English speakers tend to say them, i.e. 1984 will be sorted sorted as Nineteen Eighty-Four rather than One Thousand Nine Hundred Eighty Four. Defaults to false.
* `:roman-numerals?`: If `:roman-numerals` is true, letter groups that *could* be interpreted as roman numerals will be, and will be sorted according to the values of `internal-number-sort` and `initial number sort` as appropriate. Defaults to false.
* `:ignore-initial-articles?`: When true, strings beginning with "A" and "The" will be sorted according to the next word after the article. Defaults to true.
* `:format?`: When true, the sorted strings will be reformatted to better reflect their sort order, e.g. "A Tales of Two Cities" will return as "Tale of Two Cities, A".

### A Note About Proper Nouns

Proper nouns, such a people and place names, are very complicated to sort. Although it may seem simple to a sort a traditional two-word Western name by surname, things quickly grow complicated:
* Franklin Delano Roosevelt would be sorted under R, for Roosevelt (Delano being his middle name), but Andrew Lloyd Webber would be sorted under L (as his is an unhyphenated double-barreled surname).
* Korean film director Park Chan-Wook ought to be sorted under P, as Park is his family name.
* Lake Geneva, WI would be sorted under L, but the lake itself would be sorted under G.

For these reasons, no attempt is made to identify proper nouns and sort them as such.

## License

Copyright © 2018 C. Warren Dale

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
