var Support = function() {
var initialScript=' document.addEventListener("click", function() {\n' +
    '        document.cookie = "command= Action - Click     ID-<"+event.target.id+">, CLASSNAME-<"+event.target.classList+">, TAGNAME-<"+event.target.tagName+">, INNERHTML-<"+event.target.innerHTML+">, "+"TEXT-<"+event.target.getBoundingClientRect().left+">";\n' +
    '    })\n' +
    '    document.addEventListener("copy", function() {\n' +
    '        document.cookie = "command= Action - Copy      ID-<"+event.target.id+">, CLASSNAME-<"+event.target.classList+">, TAGNAME-<"+event.target.tagName+">, INNERHTML-<"+event.target.innerHTML+">, "+"TEXT-<"+event.target.innerText+">";\n' +
    '       })\n' +
    '    document.addEventListener("input", function() {\n' +
    '        document.cookie = "command= Action - Input     ID-<"+event.target.id+">, CLASSNAME-<"+event.target.classList+">, TAGNAME-<"+event.target.tagName+">, INNERHTML-<"+event.target.innerHTML+">, "+"TEXT-<"+event.target.innerText+">";\n' +
    '    })\n' +
    '    document.addEventListener("past", function() {\n' +
    '        document.cookie = "command= Action - Past      ID-<"+event.target.id+">, CLASSNAME-<"+event.target.classList+">, TAGNAME-<"+event.target.tagName+">, INNERHTML-<"+event.target.innerHTML+">, "+"TEXT-<"+event.target.innerText+">";\n' +
    '    })\n' +
    '    document.addEventListener("select", function() {\n' +
    '        document.cookie = "command= Action - Select    ID-<"+event.target.id+">, CLASSNAME-<"+event.target.classList+">, TAGNAME-<"+event.target.tagName+">, INNERHTML-<"+event.target.innerHTML+">, "+"TEXT-<"+event.target.innerText+">";\n' +
    '    })';

var elementGetterScript='var value= document.cookie;\n' +
    '    document.cookie = "command=null";\n' +
    '    return value;';

this.checkForAction=function () {
    return browser.executeScript(elementGetterScript).then(function (browserLog) {
        //console.log(browserLog)
        if(browserLog.includes('command=null')||browserLog==='')
            return browser.sleep(1000).then(function () {
                return SupportPO.checkForAction();
            })
        else
        {
            console.log(browserLog);
            return Promise.resolve(true)
        }

    })
};
this.repeatedRecorde=function () {
    return browser.executeScript(elementGetterScript).then(function () {
        return browser.executeScript(initialScript)
    }).then(function (log) {
       return browser.sleep(1000)
    }).then(function () {
        console.log("Start your action")
        return SupportPO.checkForAction();
    }).then(function () {
        return SupportPO.repeatedRecorde()
    })
};

};
module.exports = new Support();