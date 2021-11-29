const BaekJoon2609 = (a, b) => {
  const GCD = (a, b) => {
    if (a % b === 0) return b;
    return GCD(b, a % b);
  };
  const result = GCD(Number(a), Number(b));
  console.log(result);
  console.log((a * b) / result);
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
  BaekJoon2609(input[0], input[1]);
  process.exit();
});
