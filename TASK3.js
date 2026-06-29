let messages = [];

const input = document.getElementById("messageInput");
const addBtn = document.getElementById("addBtn");
const clearBtn = document.getElementById("clearBtn");
const charCount = document.getElementById("charCount");
const status = document.getElementById("status");
const messageSection = document.getElementById("messageSection");


input.addEventListener("input", function () {
    charCount.textContent =
        "Character Count: " + input.value.length;
});



addBtn.addEventListener("click", function () {

    let msg = input.value;

    let promise = new Promise((resolve, reject) => {

        if (msg.length >= 3) {
            resolve(msg);
        } else {
            reject("Message must contain at least 3 characters");
        }

    });

    promise
        .then(function (message) {

            status.textContent =
                "Message Added Successfully";

            messages.push(message);

            displayMessages();

            input.value = "";

            charCount.textContent =
                "Character Count: 0";
        })

        .catch(function (error) {

            status.textContent = error;

        });

});


function displayMessages() {

    messageSection.innerHTML = "";

    messages.forEach(function (msg) {

        let p = document.createElement("p");

        p.textContent = msg;

        messageSection.appendChild(p);

        setTimeout(function () {

            if (messages[index]) {

                messages.splice(1, 1);
                displayMessages();

                status.textContent =
                    "Message Expired";
            }

        }, 10000);

    });

}


clearBtn.addEventListener("click", function () {

    messages = [];

    messageSection.innerHTML = "";

    status.textContent =
        "All Messages Cleared";

});