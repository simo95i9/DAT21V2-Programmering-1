public class Exercise3 {
    static final String NATION = "The United States of America";
    static final int POPULATION_NOW = 331_002_651;

    static final int SECONDS_PER_BIRTH = 7;
    static final int SECONDS_PER_DEATH = 13;

    static final int SECONDS_PER_DAY = 86400;
    static final int DAYS_PER_YEAR = 365;
    static final int YEARS = 5;

    public static void main(String[] args) {
        // Calculate how many seconds there are in five years
        int secondsBetweenNowAndThen = YEARS * DAYS_PER_YEAR * SECONDS_PER_DAY;

        // Calculate how many births will occur between now and then
        int birthsInFiveYears = secondsBetweenNowAndThen / SECONDS_PER_BIRTH ;

        // Calculate how many deaths will occur between now and then
        int deathsInFiveYears = secondsBetweenNowAndThen / SECONDS_PER_DEATH;

        // Add the births and subtract the deaths from the current population
        int populationInFiveYears = POPULATION_NOW + birthsInFiveYears - deathsInFiveYears;

        //Print the result as a complete sentence
        System.out.printf("In %d years the population of %s is projected to be %,d\n",
                              YEARS,                     NATION,               populationInFiveYears);
        System.out.printf("\nGrowth: %,d\nSum: %,d\n", (birthsInFiveYears-deathsInFiveYears), populationInFiveYears);
    }
}
