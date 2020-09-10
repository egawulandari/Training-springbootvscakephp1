<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tampil Data Member</title>
</head>

<body>
    <div class="container">
        <div class="row">
            <div class="col">
                <table>
                    <thead>
                        <tr>
                            <th>TRX ID</th>
                            <th>Subscriber Name</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><?= $result['trx_id']; ?></td>
                            <td><?= $result['subscriber_name']; ?></td>
                        </tr>
                    </tbody>
                </table>

            </div>
        </div>
    </div>


</body>

</html>