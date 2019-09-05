# IntergalacticMerchant

## How the program works
In an economic dystopia, a merchant is determined to make money across the galaxy by selling dirts and metals found on earth. This program will help the intergalactic merchant sell their Goods from earth by converting alien numbers, that have the same concept as the roman numbers, into arabic number and calculate how many Credits required for the Goods the merchant are selling.

### Command Input
The program uses sentence template as its command input. The input (String) is split into several words that are kept in an array. From said array, the sentence is recognizable by identifying at what index a word is and a condition is set accordingly to make a command template.

For example, a command "glob is I" will be processed like:
```
1. splitting the command into an array of 3 containing {"glob", "is", "I"}
2. the program checks if array[1] contains "is"
3. if true, then the program will put array[0] {"glob"} as a key, and array[2] as its value in a HashMap used for translating alien number into roman number.
```

### Process and Output
The conditions set according to the command input are the determinant of what the program will do. There are 4 main functions that this program possesses. Those are:

* Input an alien number and its roman counterpart into a HashMap   of alien number as its key and roman number as its value to later be used as a translator. This involves Translator class as the said HashMap is located there.
* Input an alien number, a Goods name, and the total Credits required to calculate the price of each one of the Goods and put it into a Hashmap of Goods as its key and its price as its value. This involves Translator class to convert alien number into roman, RomanConverter class for converting roman into arabic number, and Pricing class as it contains methods necessary to calculate and inserting into the said HashMap.
* Input "how much is" and an alien number to convert it into an arabic number and return the result. This involves Translator class to convert alien number into roman, and RomanConverter class to convert roman into arabic number.
* Input "how many Credits is", alien number, and goods name to calculate the amount of Credits required for that amount of Goods and return the result. This involves the This involves Translator class to convert alien number into roman, and RomanConverter class to convert roman into arabic number, and Pricing class to identify what Goods is selling and calculate the Credits needed.
* if the command is unrecognizable, it will print "I have no idea what you are talking about"

### Classes, Notable attributes, and Methods

**IntergalacticMerchant**

* main()

**Roman Converter**

* HashMap<String, Integer> RomanNumeral
* RomanChecker(String)
* Convert(String)
* getRomanMap()

**InputProcessor**

* String[] DicedInput
* ReadInput(String)
* ProcessInput(String)
* isNumber(String)

**Pricing**

* HashMap<String, Double> GoodsPrice
* UpdatePrice(String, Double)
* getGoodsPriceMap()
* CountCredits(String, int)
* CountPrice(String, int)

**Translator**

* HashMap<String, String> Language
* LangInput(String, String)
* getLangMap()

## Assumptions
* The Goods the merchant sells are only Silver, Iron, and Gold.
* The input is case sensitive

## How to use
When the program runs, the user is expected to input a particular command template as shown later below. The input will decide what will the program do. 

The said templates are as follows:
```
1. [Alien number] is [Roman number]
2. [Alien number] [Goods] is [Credits amount] Credits
3. how much is [Alien number] ?
4. how many Credits is [Alien number] [Goods] ?
```

* 1st template will input alien number and its roman counterpart into dictionary 
* 2nd template will input the Goods's price based on the Credits amount/Alien number inputted
* 3rd template will return the conversion of Alien number in form of Arabic number
* 4th template will return the total Credits required for the Goods to be sold in respective quantity written in Alien number
* Other than templates written above, the program will inform you that the input is unrecognizable
* If there are unrecognizable languages, the program will ignore it
* If the translation is not a valid roman number, the program will tell that the input is incorrect

**Note that the command templates are case sensitive.**

For Example:
```
glob is I
glob glob Silver is 34 Credits
how much is glob glob ?
how many Credits is glob Silver ?
how many wood could a woodchuck chuck?
```
* 1st command will save glob as I for its roman counterpart
* 2nd command will save the price of Silver as 17 Credits each (Because glob glob Silver=2 Silver; 34 Credits / 2 = 17)
* 3rd command will return "glob glob is 2"
* 4th command will return "glob glob Silver is 34 Credits"
* 5th command will return "I have no idea what you are talking about"
