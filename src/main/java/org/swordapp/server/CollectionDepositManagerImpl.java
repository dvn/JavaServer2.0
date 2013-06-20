package org.swordapp.server;

import org.apache.abdera.i18n.iri.IRI;

public class CollectionDepositManagerImpl implements CollectionDepositManager {

    @Override
    public DepositReceipt createNew(String collectionUri, Deposit deposit, AuthCredentials authCredentials, SwordConfiguration config)
            throws SwordError, SwordServerException, SwordAuthException {
        DepositReceipt fakeDepositReceipt = new DepositReceipt();
        IRI fakeIri = new IRI("fakeIri");
        fakeDepositReceipt.setLocation(fakeIri);
        fakeDepositReceipt.setEditIRI(fakeIri);
        return fakeDepositReceipt;
    }
}
