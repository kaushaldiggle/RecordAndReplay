
describe('Record and Replay', function () {
    it('Record',function () {
        var site;
        browser.waitForAngularEnabled(false)
        return browser.get('https://www.protractortest.org/#/').then(function () {
            return SupportPO.repeatedRecorde();
        }).then(null,function (err) {
            fail(err)
        })
    })
});
