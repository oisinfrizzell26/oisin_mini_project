public abstract class Questions {
    public static String[][] getQuestions() {
        String[][] questionsArray = {
                {"What does ::= denote?", "Grammer rule", "The beginning of a comment in code.", "A mathematical operation for calculating square roots", "A binary operator used for logical AND. "},
                {"What does ≡  mean?", "A symbol indicating greater than", "denotes equivalence", "means not equal to", "means greater than or equals to"},
                {"What does \"BNF\" stand for in the context of computer science and formal grammar?", "Basic Normal Form", "Binary-Natural Factorization", "Backus-Naur Form", "Branch and Flow Notation"},
                {"what does the acronym \"NAND\" represent?", "National Association of Network Designers", "Not A Number", "Negated AND", "Non-Aligned Data"},
                {"In computer science, what does Boolean logic refer to?", "A programming language used for scientific calculations", "A system of mathematics dealing with complex numbers", "A mathematical system for handling true and false values", "A type of logic used only in quantum computing"},
                {"In computer science, what is a lattice? ", "A mathematical structure that represents graphs", "A data structure used to store integers", "A formal specification for programming languages", "A partially ordered set where every pair of elements has a unique least upper bound and greatest lower bound"},
                {"Which branch of logic is often used in discrete mathematics for representing and analyzing statements", "Boolean logic", "Fuzzy logic", "Modal logic", "Quantum logic"},
                {"What does the negation operator do", "It converts a string to an integer", "It performs subtraction between two numbers", "Reverses the meaning of its operand", "It concatenates two strings together"},
                {"Which of the following isn't a proposition", "My car is red", "Galway is in Ireland", "Are you having a nice day?", "2+2=4"},
                {"What does the biconditional statement 𝑝 ↔ q mean?", "P implies q and q implies P", "P is equal to q", "P and q have similar values", "P is not equal to q"},
                {"What is a matrix", "A geometric shape with four equal sides", "A system of equations", "A matrix is a rectangular array of numbers", "A type of polynomial equation"},
                {"You encounter two people, A and B, from the same island, where knights always tell the truth, and knaves always lie. A and B make the following statements, A says B is a knave. B says at least one of us is a knave, What are A and B? ", "A is a knight and B is a knave", "They're both knights", "They're both knaves", "A is a knave and B is a knight"},
                {"Moore's Law is defined as", "The principle that the speed and capability of computers can be expected to double every two years", "An observation made by Gordon Moore", "About the increasing number of transistors on a microchip", "Leading to smaller, more powerful, and more affordable electronic devices"},
                {"The Von Neumann bottleneck is defined as", "Arises due to the significant difference in operating speeds of CPU and memory buses", "A limitation in computer architecture", "CPU waiting for data and instructions from memory", "Impacts the overall performance of a computer system"},
                {"What is level 1 in the Contemporary Multilevel Machine", "Operating System level", "Microarchitect level", "Digital logic level", "Assembly language level"},
                {"How many bits are in a byte", "16", "3", "256", "8"},
                {"How many values does the hexadecimal System use", "2", "8", "16", "64"},
                {"What does range mean", "The distance between the largest and smallest number", "Refers to the distance a computer can transmit data wirelessly", "The distance between two adjacent numbers on a number line", "Used to describe the maximum number of computer programs that can be executed simultaneously on a computer system"}
        };
        return questionsArray;
    }
    public static String[][] getOptions() {
        String[][] optionsArray = {
                {"Grammer rule", "The beginning of a comment in code.", "A mathematical operation for calculating square roots", "A binary operator used for logical AND. "},
                {"A symbol indicating greater than", "Denotes equivalence", "Means not equal to", "Means greater than or equals to"},
                {"Basic Normal Form", "Binary-Natural Factorization", "Backus-Naur Form", "Branch and Flow Notation"},
                {"National Association of Network Designers", "Not A Number", "Negated AND", "Non-Aligned Data"},
                {"A programming language used for scientific calculations", "A system of mathematics dealing with complex numbers", "A mathematical system for handling true and false values", "A type of logic used only in quantum computing"},
                {"A mathematical structure that represents graphs", "A data structure used to store integers", "A formal specification for programming languages", "A partially ordered set where every pair of elements has a unique least upper bound and greatest lower bound"},
                {"Boolean logic", "Fuzzy logic", "Modal logic", "Quantum logic"},
                {"It converts a string to an integer", "It performs subtraction between two numbers", "Reverses the meaning of its operand", "It concatenates two strings together"},
                {"My car is red", "Galway is in Ireland", "Are you having a nice day?", "2+2=4"},
                {"P implies q and q implies p", "P is equal to q", "P and q have similar values", "P is not equal to q"},
                {"A geometric shape with four equal sides", "A system of equations", "A matrix is a rectangular array of numbers", "A type of polynomial equation"},
                {"A is a kinght and b is a knave", "There both knights", "There both knaves", "A is a knave and b is a knight"},
                {"The principle that the speed and capability of computers can be expected to double every two years", "An observation made by Gordon Moore", "About the increasing number of transistors on a microchip", "Leading to smaller, more powerful, and more affordable electronic devices"},
                {"Arises due to the significant difference in operating speeds of CPU and memory buses", "A limitation in computer architecture", "CPU waiting for data and instructions from memory", "Impacts the overall performance of a computer system"},
                {"Operating System level", "Microarchitect level", "Digital logic level", "Assembly language level"},
                {"16", "3", "256", "8"},
                {"2", "8", "16", "64"},
                {"The distance between the largest and smallest number", "Refers to the distance a computer can transmit data wirelessly", "The distance between two adjacent numbers on a number line", "Used to describe the maximum number of computer programs that can be executed simultaneously on a computer system"}
        };
        return optionsArray;
    }

    public static char[] getAnswers() {
        char[] answersArray = {'A', 'B', 'C', 'C', 'C', 'D', 'A', 'C', 'C', 'A', 'C', 'D', 'A', 'A', 'B', 'D', 'C', 'A'};
        return answersArray;
    }
}
