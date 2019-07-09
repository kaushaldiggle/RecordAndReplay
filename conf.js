global.SupportPO=require('./Support.js');
exports.config = {

    seleniumAddress: 'http://localhost:4444/wd/hub',

    specs: ['test.js'],
    framework: 'jasmine2',
    jasmineNodeOpts: {
        defaultTimeoutInterval: 40000,
        sVerbose: true,
    },
    allScriptsTimeout: 20000,
    capabilities: {
        browserName: 'chrome',

        chromeOptions: {
            args: ["--window-size=800,600" ]
        }
    },


};