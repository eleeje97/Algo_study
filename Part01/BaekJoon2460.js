const BaekJoon2460 = (input) => {
  const intArray = input.map((el) => el.split(" "));
  const sumArr = intArray.map((data) => -Number(data[0]) + Number(data[1]));
  const resultArr = [];
  sumArr.reduce((acc, cur) => {
    resultArr.push(acc);
    return acc + cur;
  }, 0);

  resultArr.sort((a, b) => b - a);
  console.log(resultArr[0]);
};

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];

rl.on("line", (line) => {
  input.push(line);
  if (input.length === 10) {
    BaekJoon2460(input);
    rl.close();
  }
}).on("close", () => {
  process.exit();
});
