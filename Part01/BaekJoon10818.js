const BaekJoon10818 = (n, input) => {
  const intArray = input.split(" ").map((input) => Number(input));
  intArray.sort((a, b) => a - b);
  console.log(intArray[0], intArray[n - 1]);
};

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];

rl.on("line", function (line) {
  input.push(line);
}).on("close", function () {
  BaekJoon10818(input[0], input[1]);
  process.exit();
});
