const BaekJoon2693 = (input) => {
  let intArray;

  for (let i = 1; i <= Number(input[0]); i++) {
    intArray = input[i].split(" ").map((input) => Number(input));
    intArray.sort((a, b) => b - a);
    console.log(intArray[2]);
  }
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
  BaekJoon2693(input);
  process.exit();
});
