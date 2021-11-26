const BaekJoon10870 = (n) => {
  let fibonacci = [];
  fibonacci[0] = 0;
  fibonacci[1] = 1;
  for (let i = 2; i <= n; i++) {
    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
  }

  console.log(fibonacci[n]);
};

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];

rl.on("line", (line) => {
  input.push(line);
  if (input.length === 1) {
    BaekJoon10870(input);
    rl.close();
  }
}).on("close", () => {
  process.exit();
});
