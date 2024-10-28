/**
 *Java script function to generate fibonacci series till n 
 */

function fibonacci(n) {

	if (n < 0) return [];
	if (n === 1) return [0];

	const fib = [0, 1];

	for (let i = 2; i < n; i++) {
		fib.push(fib[i - 1] + fib[i - 2]);
	}

	return fib;
}

const n = 10;

console.log(`Fibonacci series till ${n}:`, fibonacci(n));
