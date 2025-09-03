describe('suite 01', () => {
    it('seleção dropdown', () => {
        cy.visit('https://the-internet.herokuapp.com');
        cy.get('div[id="content"] a').contains('Dropdown').click();
        cy.get('select[id="dropdown"]').select('Option 1');
        cy.get('select[id="dropdown"] option:selected').should('have.text', 'Option 1')
    })
})