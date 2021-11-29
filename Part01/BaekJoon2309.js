const BaekJoon2309 = (input) => {
  const height = input.map(Number).sort((a, b) => a - b);
  let sumOfHeight = height.reduce((acc, cur) => acc + cur, 0);
  const minus = sumOfHeight - 100;

  let result = [];
  for (let i = 0; i < height.length; i++) {
    for (let j = i + 1; j < height.length; j++) {
      if (height[i] + height[j] === minus) {
        result = height.filter((num) => num !== height[i] && num !== height[j]);
        break;
      }
    }
  }

  result.map((height) => console.log(height));
};

const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];
rl.on("line", (line) => {
  input.push(line);

  if (input.length === 9) {
    BaekJoon2309(input);
  }
});
