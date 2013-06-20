package org.swordapp.server;

import org.apache.abdera.i18n.iri.IRI;
import org.apache.abdera.model.Feed;

public class CollectionListManagerImpl implements CollectionListManager {

    @Override
    public Feed listCollectionContents(IRI collectionIRI, AuthCredentials auth, SwordConfiguration config) throws SwordServerException, SwordAuthException, SwordError {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
