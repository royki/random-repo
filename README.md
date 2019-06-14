# random-repo

### Airports data from http://ourairports.com/data/ (released under public domain)

1. The Resources folder contains files of data for countries, airports and runway information.
2. Write a program in Scala that will ask the user for two options - Query or Reports.
   1. Query Option will ask the user for the country name or code and print the airports & runways at each airport. The input can be country code or country name.
   2. For bonus points make the test partial/fuzzy. e.g. entering zimb will result in Zimbabwe :)
    
3. Choosing Reports will print the following:
   1. 10 countries with highest number of airports (with count) and countries  with lowest number of airports.
   2. Type of runways (as indicated in `surface` column) per country
   3. Bonus: Print the top 10 most common runway latitude (indicated in `le_ident` column)
   4. Feel free to use any library/framework as necessary.
