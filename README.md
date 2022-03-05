## MicroCryptoBenchmarkFixed

This is a small benchmark covering several misuses of the JCA library.
Comparing with the original [MicroCryptoBenchmark](https://github.com/rbonifacio/MicroCryptoBenchmark), we have fixed 14 misuses. 
Both benchmarks have been customized from the [CryptoBench](https://github.com/CryptoAPI-Bench/CryptoAPI-Bench).
The main idea here is to explore SAST tools, such as:

   * [CogniCrypt](https://www.eclipse.org/cognicrypt/)
   * [CryptoGuard](https://github.com/CryptoGuardOSS/cryptoguard)
   * [HoruSec](https://horusec.io/site/)
   * [SemGrep](https://semgrep.dev/)

The results of the study have been summarized in a [CSV file](https://github.com/rbonifacio/MicroCryptoBenchmark/blob/main/data/results.csv).
There is also an [Rmd file](https://github.com/rbonifacio/MicroCryptoBenchmark/blob/main/data/analysisMicroSecurityBench.Rmd) that computes basic statistics of this study. 