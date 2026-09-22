# IT10.3

My Grade 10 IT coursework for Term 3. The NetBeans projects cover conditionals, loops, arrays, and classes. Several use `JOptionPane` for input.

## Projects

| Project | What it does |
| --- | --- |
| [`JavaApplication3`](./JavaApplication3) | Checks a driver's age and prints a licence-related message. |
| [`OddOrEven`](./OddOrEven) | Uses the remainder operator to decide whether an integer is odd or even. |
| [`OutputMonthName`](./OutputMonthName) | Converts a number from 1 to 12 into a month name and handles invalid input. |
| [`TemperatureReview`](./TemperatureReview) | Places a temperature into a range from freezing to hot. |
| [`ThinkPositive`](./ThinkPositive) | Identifies whether a number is positive, negative, or zero. |
| [`TicketDiscount`](./TicketDiscount) | Selects a ticket price according to the customer's age. |
| [`Vegetarian`](./Vegetarian) | Responds to a simple vegetarian meal choice. |

Each folder is a separate NetBeans project with its own `build.xml` and main class.

The recovered projects also include CanYouVote, LoginScreen, PasswordChecker, TrafficCheck, RainyA, RockPaperScissors and its second version, OddOrEvenV2, IfRevision, and the GlasbyNathan Term 3 practice tests and test.

Later classwork is in AccountLogIn, GuessTheNumber, Multiply, OlympicSprint, ShoppingBasket, Weather, CityTemps, Foods, FavFoods, Scores, PokemonUI, MathsClass, and LanguageStats. ContinentArea is the newer exercise using a two-dimensional array.

`Databases` contains ten Access exercises: BookingDB, CGISoft, DigitalNimbus, HopeDB, InstaPageDB, SAMusic, SocialOutreach, Theatre, VideoGameSalesDB, and XSpaceSystems. Open the `.mdb` or `.accdb` files in Microsoft Access.

## Topics covered

- `if`, `else if`, and `else`
- Comparison and remainder operators
- Numeric ranges
- Integer, decimal, and character input
- Basic input validation
- Console output

## Running a project

Open one project folder in NetBeans and run its main class.

The projects use Java 26 in their NetBeans settings. If Apache Ant and JDK 26 are installed, you can also run a project from its folder:

```bash
ant run
```

For example:

```bash
cd OddOrEven
ant run
```

## License

This coursework is available under the [MIT License](./LICENSE).

## Recovery notes

The 32 recovered projects containing source compiled with JDK 26. All ten databases opened successfully and their tables could be read. ContinentArea was added after the recovery set was assembled; it also built and ran successfully.

Some exercises still need work. MathsClass's `squares()` method returns an empty string as a placeholder, and IfRevision's later questions are incomplete. The old AddOrEven folder contained only private IDE settings; OddOrEven and OddOrEvenV2 were recovered.

Original versions of repaired files are kept in local recovery folders. Recovery copies, reference documents, generated builds, and machine-specific settings are excluded from Git.
