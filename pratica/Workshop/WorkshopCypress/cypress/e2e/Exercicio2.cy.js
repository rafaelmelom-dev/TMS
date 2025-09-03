describe('suite 02', () => {
    it('adicionando elementos', () => {
        cy.visit('https://the-internet.herokuapp.com');
        cy.get('div[id="content"] a').contains('Add/Remove Elements').click();
        cy.get('div[class="example"] button').contains('Add Element').click();
        cy.get('div[id="elements"] button').last().should('be.visible');
        cy.get('div[id="elements"] button').last().click();
        cy.get('div[id="elements"]').children().should('not.exist');
    })
})