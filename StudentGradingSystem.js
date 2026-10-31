const prompt = require("prompt-sync")();

let students = Number(prompt("Number of students: "));

let subjects = Number(prompt("Number of subjects: "));


let scores = [];
let totals = [];


for (let learner = 0; learner < students; learner++) {

    for (let subject = 0; subject < subjects; subject++) {

        let score = Number(prompt("Enter score: "));

        while (score < 0 || score > 100) {
            alert("Invalid score, please enter a score between 0 and 100");
            score = Number(prompt("Enter score: "));
            
        }
 }   }
         

   
    
