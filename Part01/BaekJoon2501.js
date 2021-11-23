const findKthDivisor = (num, k) => {
  let result = [];
  for (let i = 1; i <= num; i++) {
    if (num % i === 0) result.push(i);
  }

  return result.length + 1 > k ? result[k - 1] : "0";
};

const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl.on("line", function (line) {
  input = line.split(" ").map((el) => parseInt(el));
}).on("close", function () {
  console.log(findKthDivisor(input[0], input[1]));
  process.exit();
});
