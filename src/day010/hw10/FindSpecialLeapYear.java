package day010.hw10;

public class FindSpecialLeapYear {

    /**
     * List of Leap Years 1800 - 2400
     * 1801 – 2100
     * 1804 	1904 	2004
     * 1808 	1908 	2008
     * 1812 	1912 	2012
     * 1816 	1916 	2016
     * 1820 	1920 	2020
     * 1824 	1924 	2024
     * 1828 	1928 	2028
     * 1832 	1932 	2032
     * 1836 	1936 	2036
     * 1840 	1940 	2040
     * 1844 	1944 	2044
     * 1848 	1948 	2048
     * 1852 	1952 	2052
     * 1856 	1956 	2056
     * 1860 	1960 	2060
     * 1864 	1964 	2064
     * 1868 	1968 	2068
     * 1872 	1972 	2072
     * 1876 	1976 	2076
     * 1880 	1980 	2080
     * 1884 	1984 	2084
     * 1888 	1988 	2088
     * 1892 	1992 	2092
     * 1896 	1996 	2096
     * 2000
     * 2101 – 2400
     * 2104 	2204 	2304
     * 2108 	2208 	2308
     * 2112 	2212 	2312
     * 2116 	2216 	2316
     * 2120 	2220 	2320
     * 2124 	2224 	2324
     * 2128 	2228 	2328
     * 2132 	2232 	2332
     * 2136 	2236 	2336
     * 2140 	2240 	2340
     * 2144 	2244 	2344
     * 2148 	2248 	2348
     * 2152 	2252 	2352
     * 2156 	2256 	2356
     * 2160 	2260 	2360
     * 2164 	2264 	2364
     * 2168 	2268 	2368
     * 2172 	2272 	2372
     * 2176 	2276 	2376
     * 2180 	2280 	2380
     * 2184 	2284 	2384
     * 2188 	2288 	2388
     * 2192 	2292 	2392
     * 2196 	2296 	2396
     * 2400
     *
     * A leap year if it is divisible by four without a remainder, but if it is divisible by 100 without a remainder,
     * it is not a leap year. However, if it is evenly divisible by 400, it is a leap year.
     *
     * Write a program that checks for leap years.
     * Multiple of four.
     *
     */

    public static void main(String[] args) {

        // int year = 2020; // start with a leap year: Year 2020 satisfies the condition of the specification.
        int year = 2018; // start with not a leap year: Year 2018 not satisfies the condition of the specification.

        System.out.print("Year " + year);

        if (checkLeapYear(year) && checkMultiplicityOfFour(year)) // checkMultiplicityOfFour(year) (Multiple of four.) - seemingly redundant condition!
            System.out.println(" satisfies the condition of the specification.");
        else System.out.println(" not satisfies the condition of the specification.");
    }

    private static boolean checkLeapYear(int a) {
        return ((a % 4) == 0 && a % 100 != 0) || (a % 400) == 0;
    }

    private static boolean checkMultiplicityOfFour(int a) {
        return (a % 4) == 0;
    }
}
