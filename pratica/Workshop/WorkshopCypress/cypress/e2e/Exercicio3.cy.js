describe('suite 03', () => {
    it('menu', () => {
        const stub = cy.stub();
        cy.on('window:alert', stub);

        cy.visit('https://the-internet.herokuapp.com');
        cy.get('div[id="content"] a').contains('Context Menu').click();
        cy.get('div[id="hot-spot"]').rightclick().then(() => {
            expect(stub.getCall(0)).to.be.calledWith("You selected a context menu");
        });
    })
})