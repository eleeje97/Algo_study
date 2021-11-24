const BaekJoon3460 = (t, num) => {
  let result = "";
  for (let j = 1; j <= t; j++) {
    for (let i = 0; num[j] >= 1; i++) {
      if (num[j] % 2) {
        result = result + " " + i;
      }
      num[j] = parseInt(num[j] / 2);
    }
    console.log(result.substring(1));
    result = "";
  }
};

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl.on("line", function (line) {
  input.push(line);
}).on("close", function () {
  BaekJoon3460(input[0], input);
  process.exit();
});
